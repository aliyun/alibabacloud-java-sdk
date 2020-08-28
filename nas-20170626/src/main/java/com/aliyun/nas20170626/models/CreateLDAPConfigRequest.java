// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLDAPConfigRequest extends TeaModel {
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

    public static CreateLDAPConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDAPConfigRequest self = new CreateLDAPConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDAPConfigRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateLDAPConfigRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public CreateLDAPConfigRequest setBindDN(String bindDN) {
        this.bindDN = bindDN;
        return this;
    }
    public String getBindDN() {
        return this.bindDN;
    }

    public CreateLDAPConfigRequest setSearchBase(String searchBase) {
        this.searchBase = searchBase;
        return this;
    }
    public String getSearchBase() {
        return this.searchBase;
    }

}
