// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationSpecsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricOrganizationSpecsResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricOrganizationSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationSpecsResponseBody self = new DescribeFabricOrganizationSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationSpecsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationSpecsResponseBody setResult(java.util.List<DescribeFabricOrganizationSpecsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationSpecsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricOrganizationSpecsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricOrganizationSpecsResponseBodyResult extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("OrganizationSpecsName")
        public String organizationSpecsName;

        @NameInMap("Title")
        public String title;

        public static DescribeFabricOrganizationSpecsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationSpecsResponseBodyResult self = new DescribeFabricOrganizationSpecsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationSpecsResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeFabricOrganizationSpecsResponseBodyResult setOrganizationSpecsName(String organizationSpecsName) {
            this.organizationSpecsName = organizationSpecsName;
            return this;
        }
        public String getOrganizationSpecsName() {
            return this.organizationSpecsName;
        }

        public DescribeFabricOrganizationSpecsResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
