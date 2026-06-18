// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BLifecycle extends TeaModel {
    @NameInMap("autoResume")
    public Boolean autoResume;

    @NameInMap("onTimeout")
    public String onTimeout;

    public static E2BLifecycle build(java.util.Map<String, ?> map) throws Exception {
        E2BLifecycle self = new E2BLifecycle();
        return TeaModel.build(map, self);
    }

    public E2BLifecycle setAutoResume(Boolean autoResume) {
        this.autoResume = autoResume;
        return this;
    }
    public Boolean getAutoResume() {
        return this.autoResume;
    }

    public E2BLifecycle setOnTimeout(String onTimeout) {
        this.onTimeout = onTimeout;
        return this;
    }
    public String getOnTimeout() {
        return this.onTimeout;
    }

}
