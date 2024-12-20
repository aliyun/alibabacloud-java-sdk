// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOutbounNumListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOutbounNumListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOutbounNumListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOutbounNumListResponseBody self = new GetOutbounNumListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOutbounNumListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOutbounNumListResponseBody setData(GetOutbounNumListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOutbounNumListResponseBodyData getData() {
        return this.data;
    }

    public GetOutbounNumListResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOutbounNumListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOutbounNumListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOutbounNumListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOutbounNumListResponseBodyDataNum extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>07512234****</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetOutbounNumListResponseBodyDataNum build(java.util.Map<String, ?> map) throws Exception {
            GetOutbounNumListResponseBodyDataNum self = new GetOutbounNumListResponseBodyDataNum();
            return TeaModel.build(map, self);
        }

        public GetOutbounNumListResponseBodyDataNum setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOutbounNumListResponseBodyDataNum setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetOutbounNumListResponseBodyDataNum setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetOutbounNumListResponseBodyDataNumGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Jella</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>7688****</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetOutbounNumListResponseBodyDataNumGroup build(java.util.Map<String, ?> map) throws Exception {
            GetOutbounNumListResponseBodyDataNumGroup self = new GetOutbounNumListResponseBodyDataNumGroup();
            return TeaModel.build(map, self);
        }

        public GetOutbounNumListResponseBodyDataNumGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOutbounNumListResponseBodyDataNumGroup setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetOutbounNumListResponseBodyDataNumGroup setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetOutbounNumListResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public java.util.List<GetOutbounNumListResponseBodyDataNum> num;

        @NameInMap("NumGroup")
        public java.util.List<GetOutbounNumListResponseBodyDataNumGroup> numGroup;

        public static GetOutbounNumListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOutbounNumListResponseBodyData self = new GetOutbounNumListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOutbounNumListResponseBodyData setNum(java.util.List<GetOutbounNumListResponseBodyDataNum> num) {
            this.num = num;
            return this;
        }
        public java.util.List<GetOutbounNumListResponseBodyDataNum> getNum() {
            return this.num;
        }

        public GetOutbounNumListResponseBodyData setNumGroup(java.util.List<GetOutbounNumListResponseBodyDataNumGroup> numGroup) {
            this.numGroup = numGroup;
            return this;
        }
        public java.util.List<GetOutbounNumListResponseBodyDataNumGroup> getNumGroup() {
            return this.numGroup;
        }

    }

}
