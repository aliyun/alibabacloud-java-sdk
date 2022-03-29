// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class EmbedWatermarkResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EmbedWatermarkResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Success")
    public Boolean success;

    public static EmbedWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EmbedWatermarkResponseBody self = new EmbedWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public EmbedWatermarkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EmbedWatermarkResponseBody setData(EmbedWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EmbedWatermarkResponseBodyData getData() {
        return this.data;
    }

    public EmbedWatermarkResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public EmbedWatermarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EmbedWatermarkResponseBodyData extends TeaModel {
        @NameInMap("CarrierLink")
        public String carrierLink;

        @NameInMap("OutFileSize")
        public Long outFileSize;

        public static EmbedWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EmbedWatermarkResponseBodyData self = new EmbedWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EmbedWatermarkResponseBodyData setCarrierLink(String carrierLink) {
            this.carrierLink = carrierLink;
            return this;
        }
        public String getCarrierLink() {
            return this.carrierLink;
        }

        public EmbedWatermarkResponseBodyData setOutFileSize(Long outFileSize) {
            this.outFileSize = outFileSize;
            return this;
        }
        public Long getOutFileSize() {
            return this.outFileSize;
        }

    }

}
