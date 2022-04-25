// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class FileCnt extends TeaModel {
    // 大文件
    @NameInMap("Large")
    public Long large;

    // 中文件
    @NameInMap("Middle")
    public Long middle;

    // 小文件
    @NameInMap("Small")
    public Long small;

    // 极小文件
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
