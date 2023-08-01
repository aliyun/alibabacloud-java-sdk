// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UnbindSlbRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to remove the configured listeners. Valid values:</p>
     * <br>
     * <p>*   true: removes the configured listeners.</p>
     * <p>*   false: does not remove the configured listeners.</p>
     */
    @NameInMap("DeleteListener")
    public String deleteListener;

    /**
     * <p>The ID of the SLB instance.</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <p>The network type of the SLB instance. Valid values:</p>
     * <br>
     * <p>*   **internet**: Internet-facing SLB instance</p>
     * <p>*   **intranet**: internal-facing SLB instance</p>
     */
    @NameInMap("Type")
    public String type;

    public static UnbindSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindSlbRequest self = new UnbindSlbRequest();
        return TeaModel.build(map, self);
    }

    public UnbindSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UnbindSlbRequest setDeleteListener(String deleteListener) {
        this.deleteListener = deleteListener;
        return this;
    }
    public String getDeleteListener() {
        return this.deleteListener;
    }

    public UnbindSlbRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public UnbindSlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
