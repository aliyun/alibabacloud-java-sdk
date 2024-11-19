// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnTypesResponseBody extends TeaModel {
    /**
     * <p>The types of the domain names.</p>
     */
    @NameInMap("CdnTypes")
    public DescribeCdnTypesResponseBodyCdnTypes cdnTypes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BDA62CE4-3477-439A-B52E-D2D7C829D7C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnTypesResponseBody self = new DescribeCdnTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnTypesResponseBody setCdnTypes(DescribeCdnTypesResponseBodyCdnTypes cdnTypes) {
        this.cdnTypes = cdnTypes;
        return this;
    }
    public DescribeCdnTypesResponseBodyCdnTypes getCdnTypes() {
        return this.cdnTypes;
    }

    public DescribeCdnTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnTypesResponseBodyCdnTypesCdnType extends TeaModel {
        /**
         * <p>The description of the domain name type.</p>
         * 
         * <strong>example:</strong>
         * <p>Download Acceleration</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The type of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>download</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCdnTypesResponseBodyCdnTypesCdnType build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnTypesResponseBodyCdnTypesCdnType self = new DescribeCdnTypesResponseBodyCdnTypesCdnType();
            return TeaModel.build(map, self);
        }

        public DescribeCdnTypesResponseBodyCdnTypesCdnType setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeCdnTypesResponseBodyCdnTypesCdnType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCdnTypesResponseBodyCdnTypes extends TeaModel {
        @NameInMap("CdnType")
        public java.util.List<DescribeCdnTypesResponseBodyCdnTypesCdnType> cdnType;

        public static DescribeCdnTypesResponseBodyCdnTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnTypesResponseBodyCdnTypes self = new DescribeCdnTypesResponseBodyCdnTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCdnTypesResponseBodyCdnTypes setCdnType(java.util.List<DescribeCdnTypesResponseBodyCdnTypesCdnType> cdnType) {
            this.cdnType = cdnType;
            return this;
        }
        public java.util.List<DescribeCdnTypesResponseBodyCdnTypesCdnType> getCdnType() {
            return this.cdnType;
        }

    }

}
