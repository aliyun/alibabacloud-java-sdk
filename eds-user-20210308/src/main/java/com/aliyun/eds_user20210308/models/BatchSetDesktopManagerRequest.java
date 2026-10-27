// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class BatchSetDesktopManagerRequest extends TeaModel {
    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>Specifies whether the convenience account has local administrator permissions on the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDesktopManager")
    public String isDesktopManager;

    /**
     * <p>The list of convenience accounts.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static BatchSetDesktopManagerRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDesktopManagerRequest self = new BatchSetDesktopManagerRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetDesktopManagerRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public BatchSetDesktopManagerRequest setIsDesktopManager(String isDesktopManager) {
        this.isDesktopManager = isDesktopManager;
        return this;
    }
    public String getIsDesktopManager() {
        return this.isDesktopManager;
    }

    public BatchSetDesktopManagerRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
