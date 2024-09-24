// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyLDAPConfigRequest extends TeaModel {
    /**
     * <p>The LDAP entry.</p>
     * 
     * <strong>example:</strong>
     * <p>cn=alibaba,dc=com</p>
     */
    @NameInMap("BindDN")
    public String bindDN;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>109c042666</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The LDAP search base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc=example</p>
     */
    @NameInMap("SearchBase")
    public String searchBase;

    /**
     * <p>The LDAP service address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ldap://ldap.example.example</p>
     */
    @NameInMap("URI")
    public String URI;

    public static ModifyLDAPConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLDAPConfigRequest self = new ModifyLDAPConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLDAPConfigRequest setBindDN(String bindDN) {
        this.bindDN = bindDN;
        return this;
    }
    public String getBindDN() {
        return this.bindDN;
    }

    public ModifyLDAPConfigRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyLDAPConfigRequest setSearchBase(String searchBase) {
        this.searchBase = searchBase;
        return this;
    }
    public String getSearchBase() {
        return this.searchBase;
    }

    public ModifyLDAPConfigRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
