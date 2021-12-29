// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListDeviceGroupRequest extends TeaModel {
    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("Name")
    public String name;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Status")
    public String status;

    public static ListDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupRequest self = new ListDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public ListDeviceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDeviceGroupRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ListDeviceGroupRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListDeviceGroupRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
