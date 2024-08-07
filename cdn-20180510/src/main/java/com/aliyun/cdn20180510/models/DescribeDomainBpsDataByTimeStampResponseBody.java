// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataByTimeStampResponseBody extends TeaModel {
    /**
     * <p>A list of bandwidth values by ISP and region.</p>
     */
    @NameInMap("BpsDataList")
    public DescribeDomainBpsDataByTimeStampResponseBodyBpsDataList bpsDataList;

    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The point in time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-11-30T05:40:00Z</p>
     */
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
        /**
         * <p>The bandwidth value.</p>
         * 
         * <strong>example:</strong>
         * <p>52119553</p>
         */
        @NameInMap("Bps")
        public Long bps;

        /**
         * <p>The name of the ISP.</p>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>Liaoning</p>
         */
        @NameInMap("LocationName")
        public String locationName;

        /**
         * <p>The timestamp of the data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-30T05:40:00Z</p>
         */
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
