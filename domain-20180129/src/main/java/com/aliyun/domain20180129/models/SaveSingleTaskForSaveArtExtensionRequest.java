// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForSaveArtExtensionRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("MaterialsAndTechniques")
    public String materialsAndTechniques;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("Title")
    public String title;

    @NameInMap("DateOrPeriod")
    public String dateOrPeriod;

    @NameInMap("Maker")
    public String maker;

    @NameInMap("InscriptionsAndMarkings")
    public String inscriptionsAndMarkings;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("Features")
    public String features;

    @NameInMap("Reference")
    public String reference;

    @NameInMap("Lang")
    public String lang;

    public static SaveSingleTaskForSaveArtExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForSaveArtExtensionRequest self = new SaveSingleTaskForSaveArtExtensionRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForSaveArtExtensionRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setMaterialsAndTechniques(String materialsAndTechniques) {
        this.materialsAndTechniques = materialsAndTechniques;
        return this;
    }
    public String getMaterialsAndTechniques() {
        return this.materialsAndTechniques;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setDateOrPeriod(String dateOrPeriod) {
        this.dateOrPeriod = dateOrPeriod;
        return this;
    }
    public String getDateOrPeriod() {
        return this.dateOrPeriod;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setMaker(String maker) {
        this.maker = maker;
        return this;
    }
    public String getMaker() {
        return this.maker;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setInscriptionsAndMarkings(String inscriptionsAndMarkings) {
        this.inscriptionsAndMarkings = inscriptionsAndMarkings;
        return this;
    }
    public String getInscriptionsAndMarkings() {
        return this.inscriptionsAndMarkings;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setFeatures(String features) {
        this.features = features;
        return this;
    }
    public String getFeatures() {
        return this.features;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setReference(String reference) {
        this.reference = reference;
        return this;
    }
    public String getReference() {
        return this.reference;
    }

    public SaveSingleTaskForSaveArtExtensionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
