// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainBpsDataByTimeStampResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("TimeStamp")
    @Validation(required = true)
    public String timeStamp;

    @NameInMap("BpsDataList")
    @Validation(required = true)
    public DescribeLiveDomainBpsDataByTimeStampResponseBpsDataList bpsDataList;

    public static DescribeLiveDomainBpsDataByTimeStampResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainBpsDataByTimeStampResponse self = new DescribeLiveDomainBpsDataByTimeStampResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainBpsDataByTimeStampResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainBpsDataByTimeStampResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainBpsDataByTimeStampResponse setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public DescribeLiveDomainBpsDataByTimeStampResponse setBpsDataList(DescribeLiveDomainBpsDataByTimeStampResponseBpsDataList bpsDataList) {
        this.bpsDataList = bpsDataList;
        return this;
    }
    public DescribeLiveDomainBpsDataByTimeStampResponseBpsDataList getBpsDataList() {
        return this.bpsDataList;
    }

    public static class DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("LocationName")
        @Validation(required = true)
        public String locationName;

        @NameInMap("IspName")
        @Validation(required = true)
        public String ispName;

        @NameInMap("Bps")
        @Validation(required = true)
        public Long bps;

        public static DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel self = new DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

    }

    public static class DescribeLiveDomainBpsDataByTimeStampResponseBpsDataList extends TeaModel {
        @NameInMap("BpsDataModel")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel> bpsDataModel;

        public static DescribeLiveDomainBpsDataByTimeStampResponseBpsDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainBpsDataByTimeStampResponseBpsDataList self = new DescribeLiveDomainBpsDataByTimeStampResponseBpsDataList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBpsDataList setBpsDataModel(java.util.List<DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel> bpsDataModel) {
            this.bpsDataModel = bpsDataModel;
            return this;
        }
        public java.util.List<DescribeLiveDomainBpsDataByTimeStampResponseBpsDataListBpsDataModel> getBpsDataModel() {
            return this.bpsDataModel;
        }

    }

}
