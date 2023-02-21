// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcProductBandResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcProductBandResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static GetOcProductBandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcProductBandResponseBody self = new GetOcProductBandResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcProductBandResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcProductBandResponseBody setData(java.util.List<GetOcProductBandResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcProductBandResponseBodyData> getData() {
        return this.data;
    }

    public GetOcProductBandResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcProductBandResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcProductBandResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcProductBandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcProductBandResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcProductBandResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcProductBandResponseBodyData extends TeaModel {
        @NameInMap("BrandIntroduction")
        public String brandIntroduction;

        @NameInMap("Device")
        public String device;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("ProductIntroduction")
        public String productIntroduction;

        @NameInMap("ProductLogo")
        public String productLogo;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductTag")
        public String productTag;

        @NameInMap("ProductWebsite")
        public String productWebsite;

        public static GetOcProductBandResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcProductBandResponseBodyData self = new GetOcProductBandResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcProductBandResponseBodyData setBrandIntroduction(String brandIntroduction) {
            this.brandIntroduction = brandIntroduction;
            return this;
        }
        public String getBrandIntroduction() {
            return this.brandIntroduction;
        }

        public GetOcProductBandResponseBodyData setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public GetOcProductBandResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcProductBandResponseBodyData setProductIntroduction(String productIntroduction) {
            this.productIntroduction = productIntroduction;
            return this;
        }
        public String getProductIntroduction() {
            return this.productIntroduction;
        }

        public GetOcProductBandResponseBodyData setProductLogo(String productLogo) {
            this.productLogo = productLogo;
            return this;
        }
        public String getProductLogo() {
            return this.productLogo;
        }

        public GetOcProductBandResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetOcProductBandResponseBodyData setProductTag(String productTag) {
            this.productTag = productTag;
            return this;
        }
        public String getProductTag() {
            return this.productTag;
        }

        public GetOcProductBandResponseBodyData setProductWebsite(String productWebsite) {
            this.productWebsite = productWebsite;
            return this;
        }
        public String getProductWebsite() {
            return this.productWebsite;
        }

    }

}
