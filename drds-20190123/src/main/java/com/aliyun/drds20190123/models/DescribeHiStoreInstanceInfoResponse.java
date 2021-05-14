// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeHiStoreInstanceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HiStoreInstanceInfo")
    @Validation(required = true)
    public DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo hiStoreInstanceInfo;

    public static DescribeHiStoreInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiStoreInstanceInfoResponse self = new DescribeHiStoreInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHiStoreInstanceInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHiStoreInstanceInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHiStoreInstanceInfoResponse setHiStoreInstanceInfo(DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo hiStoreInstanceInfo) {
        this.hiStoreInstanceInfo = hiStoreInstanceInfo;
        return this;
    }
    public DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo getHiStoreInstanceInfo() {
        return this.hiStoreInstanceInfo;
    }

    public static class DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo extends TeaModel {
        @NameInMap("HistoreInstanceId")
        @Validation(required = true)
        public String historeInstanceId;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("RpmVersion")
        @Validation(required = true)
        public String rpmVersion;

        @NameInMap("DiskSize")
        @Validation(required = true)
        public Integer diskSize;

        @NameInMap("MachineSpec")
        @Validation(required = true)
        public String machineSpec;

        public static DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo self = new DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo setHistoreInstanceId(String historeInstanceId) {
            this.historeInstanceId = historeInstanceId;
            return this;
        }
        public String getHistoreInstanceId() {
            return this.historeInstanceId;
        }

        public DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo setRpmVersion(String rpmVersion) {
            this.rpmVersion = rpmVersion;
            return this;
        }
        public String getRpmVersion() {
            return this.rpmVersion;
        }

        public DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeHiStoreInstanceInfoResponseHiStoreInstanceInfo setMachineSpec(String machineSpec) {
            this.machineSpec = machineSpec;
            return this;
        }
        public String getMachineSpec() {
            return this.machineSpec;
        }

    }

}
