// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeAuctionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcJusticeAuctionResponseBodyData> data;

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

    public static GetOcJusticeAuctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeAuctionResponseBody self = new GetOcJusticeAuctionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeAuctionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcJusticeAuctionResponseBody setData(java.util.List<GetOcJusticeAuctionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcJusticeAuctionResponseBodyData> getData() {
        return this.data;
    }

    public GetOcJusticeAuctionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcJusticeAuctionResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcJusticeAuctionResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcJusticeAuctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcJusticeAuctionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcJusticeAuctionResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcJusticeAuctionResponseBodyData extends TeaModel {
        @NameInMap("AuctionDate")
        public String auctionDate;

        @NameInMap("AuctionName")
        public String auctionName;

        @NameInMap("Basis")
        public String basis;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Court")
        public String court;

        @NameInMap("Description")
        public String description;

        @NameInMap("Document")
        public String document;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("EstPrice")
        public String estPrice;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Restrict")
        public String restrict;

        @NameInMap("StartPrice")
        public String startPrice;

        public static GetOcJusticeAuctionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcJusticeAuctionResponseBodyData self = new GetOcJusticeAuctionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcJusticeAuctionResponseBodyData setAuctionDate(String auctionDate) {
            this.auctionDate = auctionDate;
            return this;
        }
        public String getAuctionDate() {
            return this.auctionDate;
        }

        public GetOcJusticeAuctionResponseBodyData setAuctionName(String auctionName) {
            this.auctionName = auctionName;
            return this;
        }
        public String getAuctionName() {
            return this.auctionName;
        }

        public GetOcJusticeAuctionResponseBodyData setBasis(String basis) {
            this.basis = basis;
            return this;
        }
        public String getBasis() {
            return this.basis;
        }

        public GetOcJusticeAuctionResponseBodyData setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public GetOcJusticeAuctionResponseBodyData setCourt(String court) {
            this.court = court;
            return this;
        }
        public String getCourt() {
            return this.court;
        }

        public GetOcJusticeAuctionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOcJusticeAuctionResponseBodyData setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public GetOcJusticeAuctionResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcJusticeAuctionResponseBodyData setEstPrice(String estPrice) {
            this.estPrice = estPrice;
            return this;
        }
        public String getEstPrice() {
            return this.estPrice;
        }

        public GetOcJusticeAuctionResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetOcJusticeAuctionResponseBodyData setRestrict(String restrict) {
            this.restrict = restrict;
            return this;
        }
        public String getRestrict() {
            return this.restrict;
        }

        public GetOcJusticeAuctionResponseBodyData setStartPrice(String startPrice) {
            this.startPrice = startPrice;
            return this;
        }
        public String getStartPrice() {
            return this.startPrice;
        }

    }

}
