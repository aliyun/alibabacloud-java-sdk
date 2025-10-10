// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Hugepage extends TeaModel {
    @NameInMap("khugepagedAllocSleepMillisecs")
    public Long khugepagedAllocSleepMillisecs;

    @NameInMap("khugepagedDefrag")
    public Long khugepagedDefrag;

    @NameInMap("khugepagedPagesToScan")
    public Long khugepagedPagesToScan;

    @NameInMap("khugepagedScanSleepMillisecs")
    public Long khugepagedScanSleepMillisecs;

    @NameInMap("transparentDefrag")
    public String transparentDefrag;

    @NameInMap("transparentEnabled")
    public String transparentEnabled;

    public static Hugepage build(java.util.Map<String, ?> map) throws Exception {
        Hugepage self = new Hugepage();
        return TeaModel.build(map, self);
    }

    public Hugepage setKhugepagedAllocSleepMillisecs(Long khugepagedAllocSleepMillisecs) {
        this.khugepagedAllocSleepMillisecs = khugepagedAllocSleepMillisecs;
        return this;
    }
    public Long getKhugepagedAllocSleepMillisecs() {
        return this.khugepagedAllocSleepMillisecs;
    }

    public Hugepage setKhugepagedDefrag(Long khugepagedDefrag) {
        this.khugepagedDefrag = khugepagedDefrag;
        return this;
    }
    public Long getKhugepagedDefrag() {
        return this.khugepagedDefrag;
    }

    public Hugepage setKhugepagedPagesToScan(Long khugepagedPagesToScan) {
        this.khugepagedPagesToScan = khugepagedPagesToScan;
        return this;
    }
    public Long getKhugepagedPagesToScan() {
        return this.khugepagedPagesToScan;
    }

    public Hugepage setKhugepagedScanSleepMillisecs(Long khugepagedScanSleepMillisecs) {
        this.khugepagedScanSleepMillisecs = khugepagedScanSleepMillisecs;
        return this;
    }
    public Long getKhugepagedScanSleepMillisecs() {
        return this.khugepagedScanSleepMillisecs;
    }

    public Hugepage setTransparentDefrag(String transparentDefrag) {
        this.transparentDefrag = transparentDefrag;
        return this;
    }
    public String getTransparentDefrag() {
        return this.transparentDefrag;
    }

    public Hugepage setTransparentEnabled(String transparentEnabled) {
        this.transparentEnabled = transparentEnabled;
        return this;
    }
    public String getTransparentEnabled() {
        return this.transparentEnabled;
    }

}
