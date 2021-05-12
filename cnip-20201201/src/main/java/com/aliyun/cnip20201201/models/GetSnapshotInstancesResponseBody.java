// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetSnapshotInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    public GetSnapshotInstancesResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetSnapshotInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotInstancesResponseBody self = new GetSnapshotInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSnapshotInstancesResponseBody setData(GetSnapshotInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSnapshotInstancesResponseBodyData getData() {
        return this.data;
    }

    public GetSnapshotInstancesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetSnapshotInstancesResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetSnapshotInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSnapshotInstancesResponseBodyDataListAnnotations extends TeaModel {
        @NameInMap("additionalProp1")
        public String additionalProp1;

        @NameInMap("additionalProp2")
        public String additionalProp2;

        @NameInMap("additionalProp3")
        public String additionalProp3;

        public static GetSnapshotInstancesResponseBodyDataListAnnotations build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotInstancesResponseBodyDataListAnnotations self = new GetSnapshotInstancesResponseBodyDataListAnnotations();
            return TeaModel.build(map, self);
        }

        public GetSnapshotInstancesResponseBodyDataListAnnotations setAdditionalProp1(String additionalProp1) {
            this.additionalProp1 = additionalProp1;
            return this;
        }
        public String getAdditionalProp1() {
            return this.additionalProp1;
        }

        public GetSnapshotInstancesResponseBodyDataListAnnotations setAdditionalProp2(String additionalProp2) {
            this.additionalProp2 = additionalProp2;
            return this;
        }
        public String getAdditionalProp2() {
            return this.additionalProp2;
        }

        public GetSnapshotInstancesResponseBodyDataListAnnotations setAdditionalProp3(String additionalProp3) {
            this.additionalProp3 = additionalProp3;
            return this;
        }
        public String getAdditionalProp3() {
            return this.additionalProp3;
        }

    }

    public static class GetSnapshotInstancesResponseBodyDataList extends TeaModel {
        @NameInMap("annotations")
        public GetSnapshotInstancesResponseBodyDataListAnnotations annotations;

        @NameInMap("cpu")
        public Integer cpu;

        @NameInMap("ecsInstanceID")
        public String ecsInstanceID;

        @NameInMap("hostName")
        public String hostName;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("imageID")
        public String imageID;

        @NameInMap("instanceType")
        public String instanceType;

        @NameInMap("internetBandwidth")
        public Integer internetBandwidth;

        @NameInMap("joinSnapshot")
        public Boolean joinSnapshot;

        @NameInMap("memory")
        public Integer memory;

        @NameInMap("privateIP")
        public String privateIP;

        @NameInMap("publicIP")
        public String publicIP;

        @NameInMap("rootPassword")
        public String rootPassword;

        @NameInMap("storageTotalSize")
        public Integer storageTotalSize;

        @NameInMap("uid")
        public String uid;

        public static GetSnapshotInstancesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotInstancesResponseBodyDataList self = new GetSnapshotInstancesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetSnapshotInstancesResponseBodyDataList setAnnotations(GetSnapshotInstancesResponseBodyDataListAnnotations annotations) {
            this.annotations = annotations;
            return this;
        }
        public GetSnapshotInstancesResponseBodyDataListAnnotations getAnnotations() {
            return this.annotations;
        }

        public GetSnapshotInstancesResponseBodyDataList setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public GetSnapshotInstancesResponseBodyDataList setEcsInstanceID(String ecsInstanceID) {
            this.ecsInstanceID = ecsInstanceID;
            return this;
        }
        public String getEcsInstanceID() {
            return this.ecsInstanceID;
        }

        public GetSnapshotInstancesResponseBodyDataList setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetSnapshotInstancesResponseBodyDataList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetSnapshotInstancesResponseBodyDataList setImageID(String imageID) {
            this.imageID = imageID;
            return this;
        }
        public String getImageID() {
            return this.imageID;
        }

        public GetSnapshotInstancesResponseBodyDataList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetSnapshotInstancesResponseBodyDataList setInternetBandwidth(Integer internetBandwidth) {
            this.internetBandwidth = internetBandwidth;
            return this;
        }
        public Integer getInternetBandwidth() {
            return this.internetBandwidth;
        }

        public GetSnapshotInstancesResponseBodyDataList setJoinSnapshot(Boolean joinSnapshot) {
            this.joinSnapshot = joinSnapshot;
            return this;
        }
        public Boolean getJoinSnapshot() {
            return this.joinSnapshot;
        }

        public GetSnapshotInstancesResponseBodyDataList setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public GetSnapshotInstancesResponseBodyDataList setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public GetSnapshotInstancesResponseBodyDataList setPublicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }
        public String getPublicIP() {
            return this.publicIP;
        }

        public GetSnapshotInstancesResponseBodyDataList setRootPassword(String rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }
        public String getRootPassword() {
            return this.rootPassword;
        }

        public GetSnapshotInstancesResponseBodyDataList setStorageTotalSize(Integer storageTotalSize) {
            this.storageTotalSize = storageTotalSize;
            return this;
        }
        public Integer getStorageTotalSize() {
            return this.storageTotalSize;
        }

        public GetSnapshotInstancesResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class GetSnapshotInstancesResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<GetSnapshotInstancesResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static GetSnapshotInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotInstancesResponseBodyData self = new GetSnapshotInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSnapshotInstancesResponseBodyData setList(java.util.List<GetSnapshotInstancesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetSnapshotInstancesResponseBodyDataList> getList() {
            return this.list;
        }

        public GetSnapshotInstancesResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSnapshotInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSnapshotInstancesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
