// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListDatasourceInstancesResponseBody extends TeaModel {
    @NameInMap("DdiDatasourceInfoList")
    public ListDatasourceInstancesResponseBodyDdiDatasourceInfoList ddiDatasourceInfoList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDatasourceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourceInstancesResponseBody self = new ListDatasourceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasourceInstancesResponseBody setDdiDatasourceInfoList(ListDatasourceInstancesResponseBodyDdiDatasourceInfoList ddiDatasourceInfoList) {
        this.ddiDatasourceInfoList = ddiDatasourceInfoList;
        return this;
    }
    public ListDatasourceInstancesResponseBodyDdiDatasourceInfoList getDdiDatasourceInfoList() {
        return this.ddiDatasourceInfoList;
    }

    public ListDatasourceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfoPrivateAddressList extends TeaModel {
        @NameInMap("privateAddressList")
        public java.util.List<String> privateAddressList;

        public static ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfoPrivateAddressList build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfoPrivateAddressList self = new ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfoPrivateAddressList();
            return TeaModel.build(map, self);
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfoPrivateAddressList setPrivateAddressList(java.util.List<String> privateAddressList) {
            this.privateAddressList = privateAddressList;
            return this;
        }
        public java.util.List<String> getPrivateAddressList() {
            return this.privateAddressList;
        }

    }

    public static class ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DatasourceId")
        public String datasourceId;

        @NameInMap("Descreption")
        public String descreption;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("PrivateAddressList")
        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfoPrivateAddressList privateAddressList;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo self = new ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo();
            return TeaModel.build(map, self);
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setDatasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public String getDatasourceId() {
            return this.datasourceId;
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setDescreption(String descreption) {
            this.descreption = descreption;
            return this;
        }
        public String getDescreption() {
            return this.descreption;
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setPrivateAddressList(ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfoPrivateAddressList privateAddressList) {
            this.privateAddressList = privateAddressList;
            return this;
        }
        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfoPrivateAddressList getPrivateAddressList() {
            return this.privateAddressList;
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class ListDatasourceInstancesResponseBodyDdiDatasourceInfoList extends TeaModel {
        @NameInMap("DdiDatasourceInfo")
        public java.util.List<ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo> ddiDatasourceInfo;

        public static ListDatasourceInstancesResponseBodyDdiDatasourceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourceInstancesResponseBodyDdiDatasourceInfoList self = new ListDatasourceInstancesResponseBodyDdiDatasourceInfoList();
            return TeaModel.build(map, self);
        }

        public ListDatasourceInstancesResponseBodyDdiDatasourceInfoList setDdiDatasourceInfo(java.util.List<ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo> ddiDatasourceInfo) {
            this.ddiDatasourceInfo = ddiDatasourceInfo;
            return this;
        }
        public java.util.List<ListDatasourceInstancesResponseBodyDdiDatasourceInfoListDdiDatasourceInfo> getDdiDatasourceInfo() {
            return this.ddiDatasourceInfo;
        }

    }

}
