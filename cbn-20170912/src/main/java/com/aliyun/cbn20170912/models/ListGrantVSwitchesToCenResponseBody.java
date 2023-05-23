// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchesToCenResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VSwitches")
    public java.util.List<ListGrantVSwitchesToCenResponseBodyVSwitches> vSwitches;

    public static ListGrantVSwitchesToCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGrantVSwitchesToCenResponseBody self = new ListGrantVSwitchesToCenResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGrantVSwitchesToCenResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGrantVSwitchesToCenResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGrantVSwitchesToCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGrantVSwitchesToCenResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListGrantVSwitchesToCenResponseBody setVSwitches(java.util.List<ListGrantVSwitchesToCenResponseBodyVSwitches> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<ListGrantVSwitchesToCenResponseBodyVSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public static class ListGrantVSwitchesToCenResponseBodyVSwitches extends TeaModel {
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListGrantVSwitchesToCenResponseBodyVSwitches build(java.util.Map<String, ?> map) throws Exception {
            ListGrantVSwitchesToCenResponseBodyVSwitches self = new ListGrantVSwitchesToCenResponseBodyVSwitches();
            return TeaModel.build(map, self);
        }

        public ListGrantVSwitchesToCenResponseBodyVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListGrantVSwitchesToCenResponseBodyVSwitches setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public ListGrantVSwitchesToCenResponseBodyVSwitches setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGrantVSwitchesToCenResponseBodyVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
