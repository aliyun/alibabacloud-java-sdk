// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ScanFileInputConfig extends TeaModel {
    @NameInMap("autoCrop")
    public String autoCrop;

    @NameInMap("autoRotate")
    public String autoRotate;

    public static ScanFileInputConfig build(java.util.Map<String, ?> map) throws Exception {
        ScanFileInputConfig self = new ScanFileInputConfig();
        return TeaModel.build(map, self);
    }

    public ScanFileInputConfig setAutoCrop(String autoCrop) {
        this.autoCrop = autoCrop;
        return this;
    }
    public String getAutoCrop() {
        return this.autoCrop;
    }

    public ScanFileInputConfig setAutoRotate(String autoRotate) {
        this.autoRotate = autoRotate;
        return this;
    }
    public String getAutoRotate() {
        return this.autoRotate;
    }

}
