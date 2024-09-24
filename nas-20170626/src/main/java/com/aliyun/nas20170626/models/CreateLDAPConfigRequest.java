// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLDAPConfigRequest extends TeaModel {
    /**
     * <p>An LDAP entry.</p>
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
     * <p>109c04****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>An LDAP search base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc=example</p>
     */
    @NameInMap("SearchBase")
    public String searchBase;

    /**
     * <p>An LDAP URI.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ldap://ldap.example.example</p>
     */
    @NameInMap("URI")
    public String URI;

    public static CreateLDAPConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDAPConfigRequest self = new CreateLDAPConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDAPConfigRequest setBindDN(String bindDN) {
        this.bindDN = bindDN;
        return this;
    }
    public String getBindDN() {
        return this.bindDN;
    }

    public CreateLDAPConfigRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateLDAPConfigRequest setSearchBase(String searchBase) {
        this.searchBase = searchBase;
        return this;
    }
    public String getSearchBase() {
        return this.searchBase;
    }

    public CreateLDAPConfigRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
