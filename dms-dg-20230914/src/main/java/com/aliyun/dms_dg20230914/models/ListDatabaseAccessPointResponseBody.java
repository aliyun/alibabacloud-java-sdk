// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class ListDatabaseAccessPointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("DbInstanceAccessPointList")
    public java.util.List<ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList> dbInstanceAccessPointList;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ListDatabaseAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccessPointResponseBody self = new ListDatabaseAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccessPointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDatabaseAccessPointResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListDatabaseAccessPointResponseBody setDbInstanceAccessPointList(java.util.List<ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList> dbInstanceAccessPointList) {
        this.dbInstanceAccessPointList = dbInstanceAccessPointList;
        return this;
    }
    public java.util.List<ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList> getDbInstanceAccessPointList() {
        return this.dbInstanceAccessPointList;
    }

    public ListDatabaseAccessPointResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListDatabaseAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabaseAccessPointResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList extends TeaModel {
        @NameInMap("AccessAddr")
        public String accessAddr;

        @NameInMap("AccessPort")
        public Integer accessPort;

        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("RouterId")
        public String routerId;

        @NameInMap("VpcAzoneId")
        public String vpcAzoneId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList build(java.util.Map<String, ?> map) throws Exception {
            ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList self = new ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList();
            return TeaModel.build(map, self);
        }

        public ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList setAccessAddr(String accessAddr) {
            this.accessAddr = accessAddr;
            return this;
        }
        public String getAccessAddr() {
            return this.accessAddr;
        }

        public ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList setAccessPort(Integer accessPort) {
            this.accessPort = accessPort;
            return this;
        }
        public Integer getAccessPort() {
            return this.accessPort;
        }

        public ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList setVpcAzoneId(String vpcAzoneId) {
            this.vpcAzoneId = vpcAzoneId;
            return this;
        }
        public String getVpcAzoneId() {
            return this.vpcAzoneId;
        }

        public ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListDatabaseAccessPointResponseBodyDbInstanceAccessPointList setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
