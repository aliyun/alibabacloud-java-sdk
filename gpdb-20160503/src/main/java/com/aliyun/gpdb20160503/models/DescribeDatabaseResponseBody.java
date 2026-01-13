// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDatabaseResponseBody extends TeaModel {
    /**
     * <p>The permission control information.</p>
     * 
     * <strong>example:</strong>
     * <p>=Tc/test_001\ntest_001=CTc/test_001</p>
     */
    @NameInMap("AccessPrivilege")
    public String accessPrivilege;

    /**
     * <p>The character set.</p>
     * <p>For more information about the value range, see Document <a href="https://www.postgresql.org/docs/current/multibyte.html">https://www.postgresql.org/docs/current/multibyte.html</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>UTF8</p>
     */
    @NameInMap("CharacterSetName")
    public String characterSetName;

    /**
     * <p>Database locale parameter that specifies string comparison and sorting rules.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The locale must be compatible with the character set specified by the CharacterSetName parameter.</p>
     * </li>
     * <li><p>Collate: You can query available collations using the command SELECT DISTINCT collname FROM pg_collation;. If not specified, the default value is en_US.utf8.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en_US.utf8</p>
     */
    @NameInMap("Collate")
    public String collate;

    /**
     * <p>Limits the number of concurrent connections. -1 indicates unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("ConnLimit")
    public String connLimit;

    /**
     * <p>Database locale parameter that specifies character classification and case conversion rules.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The locale must be compatible with the character set specified by the CharacterSetName parameter.</p>
     * </li>
     * <li><p>You can execute the SELECT DISTINCT collctype FROM pg_collation; statement to obtain the field value. The default value is en_US.utf8.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en_US.utf8</p>
     */
    @NameInMap("Ctype")
    public String ctype;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database name.</p>
     * <ul>
     * <li>Only contain letters, digits, and underscores (_).</li>
     * <li>Must start with a letter.</li>
     * <li>Up to 63 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The database comment.</p>
     * 
     * <strong>example:</strong>
     * <p>A user management database storing customer profiles.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The owner of the table.</p>
     * <ul>
     * <li>Contain lowercase letters, digits, and underscores (_).</li>
     * <li>Must start with a lowercase letter and end with a lowercase letter or a digit.</li>
     * <li>Cannot start with gp.</li>
     * <li>Must be 2 to 16 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testadb</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The database size.</p>
     * 
     * <strong>example:</strong>
     * <p>2000 MB</p>
     */
    @NameInMap("Size")
    public String size;

    /**
     * <p>The database tablespace.</p>
     * 
     * <strong>example:</strong>
     * <p>pg_default</p>
     */
    @NameInMap("TableSpace")
    public String tableSpace;

    public static DescribeDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseResponseBody self = new DescribeDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseResponseBody setAccessPrivilege(String accessPrivilege) {
        this.accessPrivilege = accessPrivilege;
        return this;
    }
    public String getAccessPrivilege() {
        return this.accessPrivilege;
    }

    public DescribeDatabaseResponseBody setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public DescribeDatabaseResponseBody setCollate(String collate) {
        this.collate = collate;
        return this;
    }
    public String getCollate() {
        return this.collate;
    }

    public DescribeDatabaseResponseBody setConnLimit(String connLimit) {
        this.connLimit = connLimit;
        return this;
    }
    public String getConnLimit() {
        return this.connLimit;
    }

    public DescribeDatabaseResponseBody setCtype(String ctype) {
        this.ctype = ctype;
        return this;
    }
    public String getCtype() {
        return this.ctype;
    }

    public DescribeDatabaseResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDatabaseResponseBody setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DescribeDatabaseResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDatabaseResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DescribeDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatabaseResponseBody setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public DescribeDatabaseResponseBody setTableSpace(String tableSpace) {
        this.tableSpace = tableSpace;
        return this;
    }
    public String getTableSpace() {
        return this.tableSpace;
    }

}
