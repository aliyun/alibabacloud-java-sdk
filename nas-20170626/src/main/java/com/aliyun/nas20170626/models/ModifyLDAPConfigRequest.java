// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyLDAPConfigRequest extends TeaModel {
    @NameInMap("FileSystemId")
    @Validation(required = true)
    public String fileSystemId;

    @NameInMap("URI")
    @Validation(required = true)
    public String URI;

    @NameInMap("BindDN")
    public String bindDN;

    @NameInMap("SearchBase")
    @Validation(required = true)
    public String searchBase;

    public static ModifyLDAPConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLDAPConfigRequest self = new ModifyLDAPConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLDAPConfigRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyLDAPConfigRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public ModifyLDAPConfigRequest setBindDN(String bindDN) {
        this.bindDN = bindDN;
        return this;
    }
    public String getBindDN() {
        return this.bindDN;
    }

    public ModifyLDAPConfigRequest setSearchBase(String searchBase) {
        this.searchBase = searchBase;
        return this;
    }
    public String getSearchBase() {
        return this.searchBase;
    }

}
