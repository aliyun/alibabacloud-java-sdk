// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class ListFaceRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    @NameInMap("Mark")
    public Long mark;

    public static ListFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFaceRequest self = new ListFaceRequest();
        return TeaModel.build(map, self);
    }

    public ListFaceRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListFaceRequest setMark(Long mark) {
        this.mark = mark;
        return this;
    }
    public Long getMark() {
        return this.mark;
    }

}
