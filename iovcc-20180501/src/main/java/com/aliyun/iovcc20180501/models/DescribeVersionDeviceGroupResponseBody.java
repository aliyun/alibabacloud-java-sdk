// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeVersionDeviceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceGroup")
    public DescribeVersionDeviceGroupResponseBodyDeviceGroup deviceGroup;

    public static DescribeVersionDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionDeviceGroupResponseBody self = new DescribeVersionDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVersionDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVersionDeviceGroupResponseBody setDeviceGroup(DescribeVersionDeviceGroupResponseBodyDeviceGroup deviceGroup) {
        this.deviceGroup = deviceGroup;
        return this;
    }
    public DescribeVersionDeviceGroupResponseBodyDeviceGroup getDeviceGroup() {
        return this.deviceGroup;
    }

    public static class DescribeVersionDeviceGroupResponseBodyDeviceGroup extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("MaxCount")
        public String maxCount;

        public static DescribeVersionDeviceGroupResponseBodyDeviceGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeVersionDeviceGroupResponseBodyDeviceGroup self = new DescribeVersionDeviceGroupResponseBodyDeviceGroup();
            return TeaModel.build(map, self);
        }

        public DescribeVersionDeviceGroupResponseBodyDeviceGroup setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeVersionDeviceGroupResponseBodyDeviceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVersionDeviceGroupResponseBodyDeviceGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVersionDeviceGroupResponseBodyDeviceGroup setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeVersionDeviceGroupResponseBodyDeviceGroup setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public DescribeVersionDeviceGroupResponseBodyDeviceGroup setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

    }

}
