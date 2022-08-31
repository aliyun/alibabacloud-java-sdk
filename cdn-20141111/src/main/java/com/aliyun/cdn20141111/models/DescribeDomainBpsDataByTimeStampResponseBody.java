// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataByTimeStampResponseBody extends TeaModel {
    @NameInMap("BpsDataList")
    public DescribeDomainBpsDataByTimeStampResponseBodyBpsDataList bpsDataList;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeStamp")
    public String timeStamp;

    public static DescribeDomainBpsDataByTimeStampResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataByTimeStampResponseBody self = new DescribeDomainBpsDataByTimeStampResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsDataByTimeStampResponseBody setBpsDataList(DescribeDomainBpsDataByTimeStampResponseBodyBpsDataList bpsDataList) {
        this.bpsDataList = bpsDataList;
        return this;
    }
    public DescribeDomainBpsDataByTimeStampResponseBodyBpsDataList getBpsDataList() {
        return this.bpsDataList;
    }

    public DescribeDomainBpsDataByTimeStampResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainBpsDataByTimeStampResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainBpsDataByTimeStampResponseBody setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public static class DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel extends TeaModel {
        @NameInMap("Bps")
        public Long bps;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("LocationName")
        public String locationName;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel self = new DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

        public DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDomainBpsDataByTimeStampResponseBodyBpsDataList extends TeaModel {
        @NameInMap("BpsDataModel")
        public java.util.List<DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel> bpsDataModel;

        public static DescribeDomainBpsDataByTimeStampResponseBodyBpsDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataByTimeStampResponseBodyBpsDataList self = new DescribeDomainBpsDataByTimeStampResponseBodyBpsDataList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsDataByTimeStampResponseBodyBpsDataList setBpsDataModel(java.util.List<DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel> bpsDataModel) {
            this.bpsDataModel = bpsDataModel;
            return this;
        }
        public java.util.List<DescribeDomainBpsDataByTimeStampResponseBodyBpsDataListBpsDataModel> getBpsDataModel() {
            return this.bpsDataModel;
        }

    }

}
