// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEntityInfoResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeEntityInfoResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeEntityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEntityInfoResponseBody self = new DescribeEntityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEntityInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEntityInfoResponseBody setData(DescribeEntityInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEntityInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeEntityInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEntityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEntityInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEntityInfoResponseBodyData extends TeaModel {
        /**
         * <p>The logical ID of the entity.</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The information about the entry.</p>
         */
        @NameInMap("EntityInfo")
        public java.util.Map<String, ?> entityInfo;

        /**
         * <p>The type of the entity. Valid values:</p>
         * <br>
         * <p>*   ip</p>
         * <p>*   domain</p>
         * <p>*   url</p>
         * <p>*   process</p>
         * <p>*   file</p>
         * <p>*   host</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The information about the risk Intelligence.</p>
         */
        @NameInMap("TipInfo")
        public java.util.Map<String, ?> tipInfo;

        public static DescribeEntityInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEntityInfoResponseBodyData self = new DescribeEntityInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEntityInfoResponseBodyData setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public DescribeEntityInfoResponseBodyData setEntityInfo(java.util.Map<String, ?> entityInfo) {
            this.entityInfo = entityInfo;
            return this;
        }
        public java.util.Map<String, ?> getEntityInfo() {
            return this.entityInfo;
        }

        public DescribeEntityInfoResponseBodyData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DescribeEntityInfoResponseBodyData setTipInfo(java.util.Map<String, ?> tipInfo) {
            this.tipInfo = tipInfo;
            return this;
        }
        public java.util.Map<String, ?> getTipInfo() {
            return this.tipInfo;
        }

    }

}
