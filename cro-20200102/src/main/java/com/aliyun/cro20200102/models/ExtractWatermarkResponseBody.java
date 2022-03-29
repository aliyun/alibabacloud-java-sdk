// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ExtractWatermarkResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ExtractWatermarkResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExtractWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractWatermarkResponseBody self = new ExtractWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractWatermarkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExtractWatermarkResponseBody setData(ExtractWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExtractWatermarkResponseBodyData getData() {
        return this.data;
    }

    public ExtractWatermarkResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ExtractWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExtractWatermarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExtractWatermarkResponseBodyData extends TeaModel {
        @NameInMap("InvisibleText")
        public String invisibleText;

        public static ExtractWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExtractWatermarkResponseBodyData self = new ExtractWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExtractWatermarkResponseBodyData setInvisibleText(String invisibleText) {
            this.invisibleText = invisibleText;
            return this;
        }
        public String getInvisibleText() {
            return this.invisibleText;
        }

    }

}
