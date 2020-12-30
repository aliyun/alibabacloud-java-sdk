// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetRegionListResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public GetRegionListResponseBodyData data;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("PageNo")
    public Integer pageNo;

    public static GetRegionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegionListResponseBody self = new GetRegionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegionListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRegionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegionListResponseBody setData(GetRegionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRegionListResponseBodyData getData() {
        return this.data;
    }

    public GetRegionListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetRegionListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public static class GetRegionListResponseBodyDataRegionList extends TeaModel {
        @NameInMap("RegionDesc")
        public String regionDesc;

        @NameInMap("Region")
        public String region;

        public static GetRegionListResponseBodyDataRegionList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionListResponseBodyDataRegionList self = new GetRegionListResponseBodyDataRegionList();
            return TeaModel.build(map, self);
        }

        public GetRegionListResponseBodyDataRegionList setRegionDesc(String regionDesc) {
            this.regionDesc = regionDesc;
            return this;
        }
        public String getRegionDesc() {
            return this.regionDesc;
        }

        public GetRegionListResponseBodyDataRegionList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetRegionListResponseBodyData extends TeaModel {
        @NameInMap("regionList")
        public java.util.List<GetRegionListResponseBodyDataRegionList> regionList;

        public static GetRegionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRegionListResponseBodyData self = new GetRegionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRegionListResponseBodyData setRegionList(java.util.List<GetRegionListResponseBodyDataRegionList> regionList) {
            this.regionList = regionList;
            return this;
        }
        public java.util.List<GetRegionListResponseBodyDataRegionList> getRegionList() {
            return this.regionList;
        }

    }

}
