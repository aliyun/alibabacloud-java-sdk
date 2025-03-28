// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetFlowTagGroupResponseBody extends TeaModel {
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

    @NameInMap("flowTagGroup")
    public GetFlowTagGroupResponseBodyFlowTagGroup flowTagGroup;

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

    public static GetFlowTagGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowTagGroupResponseBody self = new GetFlowTagGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowTagGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFlowTagGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFlowTagGroupResponseBody setFlowTagGroup(GetFlowTagGroupResponseBodyFlowTagGroup flowTagGroup) {
        this.flowTagGroup = flowTagGroup;
        return this;
    }
    public GetFlowTagGroupResponseBodyFlowTagGroup getFlowTagGroup() {
        return this.flowTagGroup;
    }

    public GetFlowTagGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFlowTagGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>#1F9AEF</p>
         */
        @NameInMap("color")
        public String color;

        /**
         * <strong>example:</strong>
         * <p>1111111111111</p>
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
         * <p>1111111111111</p>
         */
        @NameInMap("modiferAccountId")
        public String modiferAccountId;

        @NameInMap("name")
        public String name;

        public static GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList build(java.util.Map<String, ?> map) throws Exception {
            GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList self = new GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList();
            return TeaModel.build(map, self);
        }

        public GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList setModiferAccountId(String modiferAccountId) {
            this.modiferAccountId = modiferAccountId;
            return this;
        }
        public String getModiferAccountId() {
            return this.modiferAccountId;
        }

        public GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetFlowTagGroupResponseBodyFlowTagGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1111111111111</p>
         */
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        @NameInMap("flowTagList")
        public java.util.List<GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList> flowTagList;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1111111111111</p>
         */
        @NameInMap("modiferAccountId")
        public String modiferAccountId;

        @NameInMap("name")
        public String name;

        public static GetFlowTagGroupResponseBodyFlowTagGroup build(java.util.Map<String, ?> map) throws Exception {
            GetFlowTagGroupResponseBodyFlowTagGroup self = new GetFlowTagGroupResponseBodyFlowTagGroup();
            return TeaModel.build(map, self);
        }

        public GetFlowTagGroupResponseBodyFlowTagGroup setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public GetFlowTagGroupResponseBodyFlowTagGroup setFlowTagList(java.util.List<GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList> flowTagList) {
            this.flowTagList = flowTagList;
            return this;
        }
        public java.util.List<GetFlowTagGroupResponseBodyFlowTagGroupFlowTagList> getFlowTagList() {
            return this.flowTagList;
        }

        public GetFlowTagGroupResponseBodyFlowTagGroup setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetFlowTagGroupResponseBodyFlowTagGroup setModiferAccountId(String modiferAccountId) {
            this.modiferAccountId = modiferAccountId;
            return this;
        }
        public String getModiferAccountId() {
            return this.modiferAccountId;
        }

        public GetFlowTagGroupResponseBodyFlowTagGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
