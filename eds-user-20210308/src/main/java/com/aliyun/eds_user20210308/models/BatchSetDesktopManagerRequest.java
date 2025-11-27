// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class BatchSetDesktopManagerRequest extends TeaModel {
    /**
     * <p>Whether the convenience account has the local administrator permissions on cloud computers.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: no</li>
     * <li>1 (default): yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDesktopManager")
    public String isDesktopManager;

    /**
     * <p>The convenience accounts.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static BatchSetDesktopManagerRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDesktopManagerRequest self = new BatchSetDesktopManagerRequest();
        return TeaModel.build(map, self);
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
