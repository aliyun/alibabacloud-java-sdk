// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForSaveArtExtensionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2019-10-01</p>
     */
    @NameInMap("DateOrPeriod")
    public String dateOrPeriod;

    /**
     * <strong>example:</strong>
     * <p>20 cm</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.art</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>iconicity</p>
     */
    @NameInMap("Features")
    public String features;

    /**
     * <strong>example:</strong>
     * <p>realism</p>
     */
    @NameInMap("InscriptionsAndMarkings")
    public String inscriptionsAndMarkings;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>zhang san</p>
     */
    @NameInMap("Maker")
    public String maker;

    /**
     * <strong>example:</strong>
     * <p>silk</p>
     */
    @NameInMap("MaterialsAndTechniques")
    public String materialsAndTechniques;

    /**
     * <strong>example:</strong>
     * <p>The embroidery</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <strong>example:</strong>
     * <p>drawings</p>
     */
    @NameInMap("Reference")
    public String reference;

    /**
     * <strong>example:</strong>
     * <p>peace</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <strong>example:</strong>
     * <p>Peace and friendship</p>
     */
    @NameInMap("Title")
    public String title;

    public static SaveSingleTaskForSaveArtExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForSaveArtExtensionRequest self = new SaveSingleTaskForSaveArtExtensionRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForSaveArtExtensionRequest setDateOrPeriod(String dateOrPeriod) {
        this.dateOrPeriod = dateOrPeriod;
        return this;
    }
    public String getDateOrPeriod() {
        return this.dateOrPeriod;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setFeatures(String features) {
        this.features = features;
        return this;
    }
    public String getFeatures() {
        return this.features;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setInscriptionsAndMarkings(String inscriptionsAndMarkings) {
        this.inscriptionsAndMarkings = inscriptionsAndMarkings;
        return this;
    }
    public String getInscriptionsAndMarkings() {
        return this.inscriptionsAndMarkings;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setMaker(String maker) {
        this.maker = maker;
        return this;
    }
    public String getMaker() {
        return this.maker;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setMaterialsAndTechniques(String materialsAndTechniques) {
        this.materialsAndTechniques = materialsAndTechniques;
        return this;
    }
    public String getMaterialsAndTechniques() {
        return this.materialsAndTechniques;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setReference(String reference) {
        this.reference = reference;
        return this;
    }
    public String getReference() {
        return this.reference;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
