// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class WebofficePermission extends TeaModel {
    // 重命名
    @NameInMap("Rename")
    public Boolean rename;

    // 只读模式
    @NameInMap("Readonly")
    public Boolean readonly;

    // 查看历史版本
    @NameInMap("History")
    public Boolean history;

    // 打印
    @NameInMap("Print")
    public Boolean print;

    // 导出
    @NameInMap("Export")
    public Boolean export;

    // 拷贝
    @NameInMap("Copy")
    public Boolean copy;

    public static WebofficePermission build(java.util.Map<String, ?> map) throws Exception {
        WebofficePermission self = new WebofficePermission();
        return TeaModel.build(map, self);
    }

    public WebofficePermission setRename(Boolean rename) {
        this.rename = rename;
        return this;
    }
    public Boolean getRename() {
        return this.rename;
    }

    public WebofficePermission setReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    public Boolean getReadonly() {
        return this.readonly;
    }

    public WebofficePermission setHistory(Boolean history) {
        this.history = history;
        return this;
    }
    public Boolean getHistory() {
        return this.history;
    }

    public WebofficePermission setPrint(Boolean print) {
        this.print = print;
        return this;
    }
    public Boolean getPrint() {
        return this.print;
    }

    public WebofficePermission setExport(Boolean export) {
        this.export = export;
        return this;
    }
    public Boolean getExport() {
        return this.export;
    }

    public WebofficePermission setCopy(Boolean copy) {
        this.copy = copy;
        return this;
    }
    public Boolean getCopy() {
        return this.copy;
    }

}
