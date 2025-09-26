// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteBrowserOut extends TeaModel {
    @NameInMap("browserId")
    public String browserId;

    @NameInMap("browserName")
    public String browserName;

    @NameInMap("status")
    public String status;

    public static DeleteBrowserOut build(java.util.Map<String, ?> map) throws Exception {
        DeleteBrowserOut self = new DeleteBrowserOut();
        return TeaModel.build(map, self);
    }

    public DeleteBrowserOut setBrowserId(String browserId) {
        this.browserId = browserId;
        return this;
    }
    public String getBrowserId() {
        return this.browserId;
    }

    public DeleteBrowserOut setBrowserName(String browserName) {
        this.browserName = browserName;
        return this;
    }
    public String getBrowserName() {
        return this.browserName;
    }

    public DeleteBrowserOut setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
