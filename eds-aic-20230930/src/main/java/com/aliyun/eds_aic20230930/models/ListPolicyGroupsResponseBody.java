// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ListPolicyGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PolicyGroupModel")
    public java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModel> policyGroupModel;

    /**
     * <strong>example:</strong>
     * <p>7B9EFA4F-4305-5968-BAEE-BD8B8DE5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPolicyGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyGroupsResponseBody self = new ListPolicyGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicyGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPolicyGroupsResponseBody setPolicyGroupModel(java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModel> policyGroupModel) {
        this.policyGroupModel = policyGroupModel;
        return this;
    }
    public java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModel> getPolicyGroupModel() {
        return this.policyGroupModel;
    }

    public ListPolicyGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicyGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPolicyGroupsResponseBodyPolicyGroupModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CameraRedirect")
        public String cameraRedirect;

        /**
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <strong>example:</strong>
         * <p>2024-06-04 10:28:54</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>download</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("LocalDrive")
        public String localDrive;

        /**
         * <strong>example:</strong>
         * <p>pg-9q6o8qpiy8opkj****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        /**
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("SessionResolutionHeight")
        public String sessionResolutionHeight;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("SessionResolutionWidth")
        public String sessionResolutionWidth;

        public static ListPolicyGroupsResponseBodyPolicyGroupModel build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyGroupsResponseBodyPolicyGroupModel self = new ListPolicyGroupsResponseBodyPolicyGroupModel();
            return TeaModel.build(map, self);
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setCameraRedirect(String cameraRedirect) {
            this.cameraRedirect = cameraRedirect;
            return this;
        }
        public String getCameraRedirect() {
            return this.cameraRedirect;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setHtml5FileTransfer(String html5FileTransfer) {
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setLocalDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }
        public String getLocalDrive() {
            return this.localDrive;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setSessionResolutionHeight(String sessionResolutionHeight) {
            this.sessionResolutionHeight = sessionResolutionHeight;
            return this;
        }
        public String getSessionResolutionHeight() {
            return this.sessionResolutionHeight;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setSessionResolutionWidth(String sessionResolutionWidth) {
            this.sessionResolutionWidth = sessionResolutionWidth;
            return this;
        }
        public String getSessionResolutionWidth() {
            return this.sessionResolutionWidth;
        }

    }

}
