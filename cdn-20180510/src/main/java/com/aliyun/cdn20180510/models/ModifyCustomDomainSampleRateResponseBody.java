// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCustomDomainSampleRateResponseBody extends TeaModel {
    @NameInMap("Content")
    public ModifyCustomDomainSampleRateResponseBodyContent content;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCustomDomainSampleRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomDomainSampleRateResponseBody self = new ModifyCustomDomainSampleRateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomDomainSampleRateResponseBody setContent(ModifyCustomDomainSampleRateResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ModifyCustomDomainSampleRateResponseBodyContent getContent() {
        return this.content;
    }

    public ModifyCustomDomainSampleRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyCustomDomainSampleRateResponseBodyContentContent extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("SampleRate")
        public Float sampleRate;

        public static ModifyCustomDomainSampleRateResponseBodyContentContent build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomDomainSampleRateResponseBodyContentContent self = new ModifyCustomDomainSampleRateResponseBodyContentContent();
            return TeaModel.build(map, self);
        }

        public ModifyCustomDomainSampleRateResponseBodyContentContent setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ModifyCustomDomainSampleRateResponseBodyContentContent setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public ModifyCustomDomainSampleRateResponseBodyContentContent setSampleRate(Float sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Float getSampleRate() {
            return this.sampleRate;
        }

    }

    public static class ModifyCustomDomainSampleRateResponseBodyContent extends TeaModel {
        @NameInMap("content")
        public java.util.List<ModifyCustomDomainSampleRateResponseBodyContentContent> content;

        public static ModifyCustomDomainSampleRateResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomDomainSampleRateResponseBodyContent self = new ModifyCustomDomainSampleRateResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ModifyCustomDomainSampleRateResponseBodyContent setContent(java.util.List<ModifyCustomDomainSampleRateResponseBodyContentContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ModifyCustomDomainSampleRateResponseBodyContentContent> getContent() {
            return this.content;
        }

    }

}
