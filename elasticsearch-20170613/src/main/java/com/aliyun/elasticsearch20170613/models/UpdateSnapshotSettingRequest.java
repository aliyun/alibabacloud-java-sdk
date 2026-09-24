// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSnapshotSettingRequest extends TeaModel {
    /**
     * <p>The data backup configuration, including the automatic backup start time and the scheduled backup switch.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;quartzRegex&quot;:&quot;0 0 01 ? * * <em>&quot;,
     *     &quot;enable&quot;:true,
     *     &quot;indices&quot;: [
     *         &quot;orders-</em>&quot;
     *     ]
     * }</p>
     */
    @NameInMap("body")
    public String body;

    public static UpdateSnapshotSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotSettingRequest self = new UpdateSnapshotSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotSettingRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
