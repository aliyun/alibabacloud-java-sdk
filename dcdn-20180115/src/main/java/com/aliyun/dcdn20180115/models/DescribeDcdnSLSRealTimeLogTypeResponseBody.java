// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSLSRealTimeLogTypeResponseBody extends TeaModel {
    @NameInMap("Content")
    public DescribeDcdnSLSRealTimeLogTypeResponseBodyContent content;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnSLSRealTimeLogTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSLSRealTimeLogTypeResponseBody self = new DescribeDcdnSLSRealTimeLogTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSLSRealTimeLogTypeResponseBody setContent(DescribeDcdnSLSRealTimeLogTypeResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeDcdnSLSRealTimeLogTypeResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeDcdnSLSRealTimeLogTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnSLSRealTimeLogTypeResponseBodyContentBusiness extends TeaModel {
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("Desc")
        public String desc;

        public static DescribeDcdnSLSRealTimeLogTypeResponseBodyContentBusiness build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSLSRealTimeLogTypeResponseBodyContentBusiness self = new DescribeDcdnSLSRealTimeLogTypeResponseBodyContentBusiness();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSLSRealTimeLogTypeResponseBodyContentBusiness setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public DescribeDcdnSLSRealTimeLogTypeResponseBodyContentBusiness setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class DescribeDcdnSLSRealTimeLogTypeResponseBodyContent extends TeaModel {
        @NameInMap("Business")
        public java.util.List<DescribeDcdnSLSRealTimeLogTypeResponseBodyContentBusiness> business;

        public static DescribeDcdnSLSRealTimeLogTypeResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSLSRealTimeLogTypeResponseBodyContent self = new DescribeDcdnSLSRealTimeLogTypeResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSLSRealTimeLogTypeResponseBodyContent setBusiness(java.util.List<DescribeDcdnSLSRealTimeLogTypeResponseBodyContentBusiness> business) {
            this.business = business;
            return this;
        }
        public java.util.List<DescribeDcdnSLSRealTimeLogTypeResponseBodyContentBusiness> getBusiness() {
            return this.business;
        }

    }

}
