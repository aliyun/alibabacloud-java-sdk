// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainBpsDataByTimeStampResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("TimeStamp")
    public String timeStamp;

    @NameInMap("BpsDataList")
    public DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataList bpsDataList;

    public static DescribeLiveDomainBpsDataByTimeStampResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainBpsDataByTimeStampResponseBody self = new DescribeLiveDomainBpsDataByTimeStampResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainBpsDataByTimeStampResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainBpsDataByTimeStampResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainBpsDataByTimeStampResponseBody setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public DescribeLiveDomainBpsDataByTimeStampResponseBody setBpsDataList(DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataList bpsDataList) {
        this.bpsDataList = bpsDataList;
        return this;
    }
    public DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataList getBpsDataList() {
        return this.bpsDataList;
    }

    public static class DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("LocationName")
        public String locationName;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("Bps")
        public Long bps;

        public static DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel self = new DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

    }

    public static class DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataList extends TeaModel {
        @NameInMap("BpsDataModel")
        public java.util.List<DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel> bpsDataModel;

        public static DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataList self = new DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataList setBpsDataModel(java.util.List<DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel> bpsDataModel) {
            this.bpsDataModel = bpsDataModel;
            return this;
        }
        public java.util.List<DescribeLiveDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel> getBpsDataModel() {
            return this.bpsDataModel;
        }

    }

}
