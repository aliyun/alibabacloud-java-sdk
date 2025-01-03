// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListFlowTagGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("flowTagGroups")
    public java.util.List<ListFlowTagGroupsResponseBodyFlowTagGroups> flowTagGroups;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true 接口调用成功，false 接口调用失败</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListFlowTagGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowTagGroupsResponseBody self = new ListFlowTagGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowTagGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFlowTagGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFlowTagGroupsResponseBody setFlowTagGroups(java.util.List<ListFlowTagGroupsResponseBodyFlowTagGroups> flowTagGroups) {
        this.flowTagGroups = flowTagGroups;
        return this;
    }
    public java.util.List<ListFlowTagGroupsResponseBodyFlowTagGroups> getFlowTagGroups() {
        return this.flowTagGroups;
    }

    public ListFlowTagGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowTagGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFlowTagGroupsResponseBodyFlowTagGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>11111111</p>
         */
        @NameInMap("modiferAccountId")
        public String modiferAccountId;

        /**
         * <strong>example:</strong>
         * <p>标签名称</p>
         */
        @NameInMap("name")
        public String name;

        public static ListFlowTagGroupsResponseBodyFlowTagGroups build(java.util.Map<String, ?> map) throws Exception {
            ListFlowTagGroupsResponseBodyFlowTagGroups self = new ListFlowTagGroupsResponseBodyFlowTagGroups();
            return TeaModel.build(map, self);
        }

        public ListFlowTagGroupsResponseBodyFlowTagGroups setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public ListFlowTagGroupsResponseBodyFlowTagGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListFlowTagGroupsResponseBodyFlowTagGroups setModiferAccountId(String modiferAccountId) {
            this.modiferAccountId = modiferAccountId;
            return this;
        }
        public String getModiferAccountId() {
            return this.modiferAccountId;
        }

        public ListFlowTagGroupsResponseBodyFlowTagGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
