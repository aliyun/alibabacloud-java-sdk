// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOutbounNumListResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Information about the number list.</p>
     */
    @NameInMap("Data")
    public GetOutbounNumListResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded.</p>
     * 
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
        /**
         * <p>Description of the caller number (geographic location information).</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省杭州市</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Caller number type. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Number.  </li>
         * <li><strong>2</strong>: Number group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>Caller number.</p>
         * 
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
         * <p>Number group description (number group name).</p>
         * 
         * <strong>example:</strong>
         * <p>Jella</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Number group type. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Number.  </li>
         * <li><strong>2</strong>: Number group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>Number group ID.</p>
         * 
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
        /**
         * <p>Caller number information.</p>
         */
        @NameInMap("Num")
        public java.util.List<GetOutbounNumListResponseBodyDataNum> num;

        /**
         * <p>Number group information.</p>
         */
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
