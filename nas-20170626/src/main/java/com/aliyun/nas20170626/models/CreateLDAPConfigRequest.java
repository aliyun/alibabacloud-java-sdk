// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLDAPConfigRequest extends TeaModel {
    /**
     * <p>An LDAP entry.</p>
     */
    @NameInMap("BindDN")
    public String bindDN;

    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>An LDAP search base.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SearchBase")
    public String searchBase;

    /**
     * <p>An LDAP URI.</p>
     * <br>
     * <p>This parameter is required.</p>
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
