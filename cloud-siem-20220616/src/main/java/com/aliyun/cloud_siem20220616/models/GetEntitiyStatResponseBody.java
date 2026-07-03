// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetEntitiyStatResponseBody extends TeaModel {
    /**
     * <p>The status code of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public java.util.List<GetEntitiyStatResponseBodyData> data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: successful.</li>
     * <li>false: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEntitiyStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEntitiyStatResponseBody self = new GetEntitiyStatResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEntitiyStatResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetEntitiyStatResponseBody setData(java.util.List<GetEntitiyStatResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetEntitiyStatResponseBodyData> getData() {
        return this.data;
    }

    public GetEntitiyStatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEntitiyStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEntitiyStatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEntitiyStatResponseBodyData extends TeaModel {
        /**
         * <p>The number of entities.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EntityNum")
        public Integer entityNum;

        /**
         * <p>The entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The entity UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>5cde2118666ffda40783ebd7cec9a60a</p>
         */
        @NameInMap("EntityUuid")
        public String entityUuid;

        public static GetEntitiyStatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEntitiyStatResponseBodyData self = new GetEntitiyStatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEntitiyStatResponseBodyData setEntityNum(Integer entityNum) {
            this.entityNum = entityNum;
            return this;
        }
        public Integer getEntityNum() {
            return this.entityNum;
        }

        public GetEntitiyStatResponseBodyData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public GetEntitiyStatResponseBodyData setEntityUuid(String entityUuid) {
            this.entityUuid = entityUuid;
            return this;
        }
        public String getEntityUuid() {
            return this.entityUuid;
        }

    }

}
