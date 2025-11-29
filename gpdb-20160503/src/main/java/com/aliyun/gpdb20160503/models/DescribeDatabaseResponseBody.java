// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDatabaseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>=Tc/test_001\ntest_001=CTc/test_001</p>
     */
    @NameInMap("AccessPrivilege")
    public String accessPrivilege;

    /**
     * <strong>example:</strong>
     * <p>UTF8</p>
     */
    @NameInMap("CharacterSetName")
    public String characterSetName;

    /**
     * <strong>example:</strong>
     * <p>en_US.utf8</p>
     */
    @NameInMap("Collate")
    public String collate;

    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("ConnLimit")
    public String connLimit;

    /**
     * <strong>example:</strong>
     * <p>en_US.utf8</p>
     */
    @NameInMap("Ctype")
    public String ctype;

    /**
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>A user management database storing customer profiles.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>testadb</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2000 MB</p>
     */
    @NameInMap("Size")
    public String size;

    /**
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
