// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAgenticSqlExecuteCredentialRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1xxxxxxxx</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The UUID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>9f8e7d6c-xxxx-xxxx-xxxx-1a2b3c4d5e6f</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The UUID of the database. If you specify this parameter, the credential is restricted to this database. You can call the ListDatabases operation to obtain the UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>6c4e8a2b-xxxx-xxxx-xxxx-0f1d2e3c4b5a</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The fully qualified name of the database. This parameter must be used together with CatalogUuid or CatalogName.</p>
     * <ul>
     * <li>MySQL database: The value is the same as the database name.</li>
     * <li>PostgreSQL database or other databases with schemas: The value is in the database.schema format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    public static CreateAgenticSqlExecuteCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticSqlExecuteCredentialRequest self = new CreateAgenticSqlExecuteCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgenticSqlExecuteCredentialRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public CreateAgenticSqlExecuteCredentialRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public CreateAgenticSqlExecuteCredentialRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public CreateAgenticSqlExecuteCredentialRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

}
