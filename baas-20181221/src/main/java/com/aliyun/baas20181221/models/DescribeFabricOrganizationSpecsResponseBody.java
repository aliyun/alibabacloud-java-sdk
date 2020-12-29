// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationSpecsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricOrganizationSpecsResponseBodyResult> result;

    public static DescribeFabricOrganizationSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationSpecsResponseBody self = new DescribeFabricOrganizationSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationSpecsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationSpecsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricOrganizationSpecsResponseBody setResult(java.util.List<DescribeFabricOrganizationSpecsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationSpecsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricOrganizationSpecsResponseBodyResult extends TeaModel {
        @NameInMap("Title")
        public String title;

        @NameInMap("OrganizationSpecsName")
        public String organizationSpecsName;

        @NameInMap("Enable")
        public Boolean enable;

        public static DescribeFabricOrganizationSpecsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationSpecsResponseBodyResult self = new DescribeFabricOrganizationSpecsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationSpecsResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeFabricOrganizationSpecsResponseBodyResult setOrganizationSpecsName(String organizationSpecsName) {
            this.organizationSpecsName = organizationSpecsName;
            return this;
        }
        public String getOrganizationSpecsName() {
            return this.organizationSpecsName;
        }

        public DescribeFabricOrganizationSpecsResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
