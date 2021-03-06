// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeHiStoreInstanceInfoResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HiStoreInstanceInfo")
    public DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo hiStoreInstanceInfo;

    public static DescribeHiStoreInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiStoreInstanceInfoResponseBody self = new DescribeHiStoreInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHiStoreInstanceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHiStoreInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHiStoreInstanceInfoResponseBody setHiStoreInstanceInfo(DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo hiStoreInstanceInfo) {
        this.hiStoreInstanceInfo = hiStoreInstanceInfo;
        return this;
    }
    public DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo getHiStoreInstanceInfo() {
        return this.hiStoreInstanceInfo;
    }

    public static class DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("MachineSpec")
        public String machineSpec;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("RpmVersion")
        public String rpmVersion;

        @NameInMap("HistoreInstanceId")
        public String historeInstanceId;

        public static DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo self = new DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo setMachineSpec(String machineSpec) {
            this.machineSpec = machineSpec;
            return this;
        }
        public String getMachineSpec() {
            return this.machineSpec;
        }

        public DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo setRpmVersion(String rpmVersion) {
            this.rpmVersion = rpmVersion;
            return this;
        }
        public String getRpmVersion() {
            return this.rpmVersion;
        }

        public DescribeHiStoreInstanceInfoResponseBodyHiStoreInstanceInfo setHistoreInstanceId(String historeInstanceId) {
            this.historeInstanceId = historeInstanceId;
            return this;
        }
        public String getHistoreInstanceId() {
            return this.historeInstanceId;
        }

    }

}
