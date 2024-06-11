// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class SubmitAccessorFullDomainsOssListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OssList")
    public java.util.List<String> ossList;

    public static SubmitAccessorFullDomainsOssListRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAccessorFullDomainsOssListRequest self = new SubmitAccessorFullDomainsOssListRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAccessorFullDomainsOssListRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public SubmitAccessorFullDomainsOssListRequest setOssList(java.util.List<String> ossList) {
        this.ossList = ossList;
        return this;
    }
    public java.util.List<String> getOssList() {
        return this.ossList;
    }

}
