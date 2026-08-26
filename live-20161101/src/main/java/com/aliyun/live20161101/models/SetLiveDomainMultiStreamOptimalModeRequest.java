// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainMultiStreamOptimalModeRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testapp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The primary streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The automatic mode switch. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OptimalMode")
    public String optimalMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The live stream name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>teststream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static SetLiveDomainMultiStreamOptimalModeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainMultiStreamOptimalModeRequest self = new SetLiveDomainMultiStreamOptimalModeRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainMultiStreamOptimalModeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SetLiveDomainMultiStreamOptimalModeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetLiveDomainMultiStreamOptimalModeRequest setOptimalMode(String optimalMode) {
        this.optimalMode = optimalMode;
        return this;
    }
    public String getOptimalMode() {
        return this.optimalMode;
    }

    public SetLiveDomainMultiStreamOptimalModeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveDomainMultiStreamOptimalModeRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
