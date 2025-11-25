// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateInstanceSyncTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>60.182.79.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateInstanceSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceSyncTaskRequest self = new CreateInstanceSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceSyncTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateInstanceSyncTaskRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
