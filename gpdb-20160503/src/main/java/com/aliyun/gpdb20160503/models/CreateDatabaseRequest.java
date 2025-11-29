// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    /**
     * <p>The character set.</p>
     * <p>For more information about the value range, see Document <a href="url">https://www.postgresql.org/docs/current/multibyte.html</a>.</p>
     * <p>Default value: UTF-8.</p>
     * 
     * <strong>example:</strong>
     * <p>UTF8</p>
     */
    @NameInMap("CharacterSetName")
    public String characterSetName;

    /**
     * <p>Database locale parameter (specifies string comparison/sorting rules).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The locale must be compatible with the character set specified by the CharacterSetName parameter.</p>
     * </li>
     * <li><p>Valid values for the Collate field: You can execute the SELECT DISTINCT collname FROM pg_collation; statement to obtain the field value. The default value is en_US.utf8.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en_US.utf8</p>
     */
    @NameInMap("Collate")
    public String collate;

    /**
     * <p>Database locale parameter (defines character classification/case conversion rules).</p>
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
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * <ul>
     * <li>Only contains letters, digits, and underscores (_).</li>
     * <li>Must start with a letter.</li>
     * <li>Up to 63 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The description of the database.</p>
     * <ul>
     * <li>Must start with a letter.</li>
     * <li>Cannot start with http:// or https://.</li>
     * <li>Only contains letters, underscores (_), hyphens (-), and digits.</li>
     * <li>Must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>A user management database storing customer profiles.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The owner of the table.</p>
     * <ul>
     * <li>Only contains lowercase letters, digits, and underscores (_).</li>
     * <li>Must start with a lowercase letter and end with a lowercase letter or a digit.</li>
     * <li>Cannot start with gp.</li>
     * <li>Must be 2 to 16 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testadb</p>
     */
    @NameInMap("Owner")
    public String owner;

    public static CreateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseRequest self = new CreateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseRequest setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public CreateDatabaseRequest setCollate(String collate) {
        this.collate = collate;
        return this;
    }
    public String getCollate() {
        return this.collate;
    }

    public CreateDatabaseRequest setCtype(String ctype) {
        this.ctype = ctype;
        return this;
    }
    public String getCtype() {
        return this.ctype;
    }

    public CreateDatabaseRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDatabaseRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateDatabaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatabaseRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
