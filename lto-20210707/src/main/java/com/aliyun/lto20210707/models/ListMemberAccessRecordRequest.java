// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListMemberAccessRecordRequest extends TeaModel {
    @NameInMap("AccessStatus")
    public String accessStatus;

    @NameInMap("Contactor")
    public String contactor;

    @NameInMap("Name")
    public String name;

    @NameInMap("Num")
    public Long num;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Uid")
    public String uid;

    public static ListMemberAccessRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemberAccessRecordRequest self = new ListMemberAccessRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListMemberAccessRecordRequest setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }
    public String getAccessStatus() {
        return this.accessStatus;
    }

    public ListMemberAccessRecordRequest setContactor(String contactor) {
        this.contactor = contactor;
        return this;
    }
    public String getContactor() {
        return this.contactor;
    }

    public ListMemberAccessRecordRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMemberAccessRecordRequest setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public ListMemberAccessRecordRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListMemberAccessRecordRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
