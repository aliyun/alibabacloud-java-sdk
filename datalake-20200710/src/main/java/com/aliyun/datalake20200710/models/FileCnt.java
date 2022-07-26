// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class FileCnt extends TeaModel {
    @NameInMap("Large")
    public Long large;

    @NameInMap("Middle")
    public Long middle;

    @NameInMap("Small")
    public Long small;

    @NameInMap("Tiny")
    public Long tiny;

    public static FileCnt build(java.util.Map<String, ?> map) throws Exception {
        FileCnt self = new FileCnt();
        return TeaModel.build(map, self);
    }

    public FileCnt setLarge(Long large) {
        this.large = large;
        return this;
    }
    public Long getLarge() {
        return this.large;
    }

    public FileCnt setMiddle(Long middle) {
        this.middle = middle;
        return this;
    }
    public Long getMiddle() {
        return this.middle;
    }

    public FileCnt setSmall(Long small) {
        this.small = small;
        return this;
    }
    public Long getSmall() {
        return this.small;
    }

    public FileCnt setTiny(Long tiny) {
        this.tiny = tiny;
        return this;
    }
    public Long getTiny() {
        return this.tiny;
    }

}
