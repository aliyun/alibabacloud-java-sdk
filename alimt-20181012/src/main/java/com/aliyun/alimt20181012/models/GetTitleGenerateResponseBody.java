// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleGenerateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetTitleGenerateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DC2DCCC9-C3DF-4F59-8D8E-78185729F16D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTitleGenerateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTitleGenerateResponseBody self = new GetTitleGenerateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTitleGenerateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTitleGenerateResponseBody setData(GetTitleGenerateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTitleGenerateResponseBodyData getData() {
        return this.data;
    }

    public GetTitleGenerateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTitleGenerateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTitleGenerateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10pcs 80ml Kitchen Disposable Plastic Sauce Cup Pot Chutney Container</p>
         */
        @NameInMap("Titles")
        public String titles;

        public static GetTitleGenerateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTitleGenerateResponseBodyData self = new GetTitleGenerateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTitleGenerateResponseBodyData setTitles(String titles) {
            this.titles = titles;
            return this;
        }
        public String getTitles() {
            return this.titles;
        }

    }

}
